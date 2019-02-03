package com.axon1.axonapps.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.*
import com.axon1.axonapps.AccountActivity
import com.axon1.axonapps.R

import java.util.ArrayList
import java.util.HashMap

class JoinUsFragment : Fragment() {

   /* var AreasList: ArrayList<ApiDefinitionDto> = ArrayList<ApiDefinitionDto>()
    var CitiesList: ArrayList<ApiDefinitionDto> = ArrayList<ApiDefinitionDto>()
    var CountriesList: ArrayList<ApiDefinitionDto> = ArrayList<ApiDefinitionDto>()
    var TypesList: ArrayList<ApiDefinitionDto> = ArrayList<ApiDefinitionDto>()*/
    lateinit var accountActivity: AccountActivity
    lateinit var btnSubmitRequest: Button
//    lateinit var spinnerJoinUsAreas: Spinner
//    lateinit var spinnerJoinUsCities: Spinner
//    lateinit var spinnerJoinUsCountries: Spinner
//    lateinit var spinnerJoinUsProviderTypes: Spinner
//    lateinit var txtJoinUsAddress: EditText
//    lateinit var txtJoinUsEmail: EditText
//    lateinit var txtJoinUsPhoneNumber: EditText
//    lateinit var txtJoinUsProviderName: EditText

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context != null) {
            this.accountActivity = context as AccountActivity
        }
    }

    override fun onCreateView(layoutInflater: LayoutInflater, viewGroup: ViewGroup?, bundle: Bundle?): View {
        var view = layoutInflater.inflate(R.layout.fragment_joinus, viewGroup, false)
        declareControls(view)
        loadDataService()
        /*TypesList.add(ApiDefinitionDto(0, accountActivity.resources.getString(R.string.Pages_JoinUs_AllProviderTypes)))
        CountriesList.add(ApiDefinitionDto(0, accountActivity.resources.getString(R.string.Pages_JoinUs_AllCountries)))
        CitiesList.add(ApiDefinitionDto(0, accountActivity.resources.getString(R.string.Pages_JoinUs_AllCities)))
        AreasList.add(ApiDefinitionDto(0, accountActivity.resources.getString(R.string.Pages_JoinUs_AllAreas)))*/
        btnSubmitRequest.setOnClickListener(OnClickListener {
            if (validate())
//                submitRequestService()
                accountActivity.replaceFragment(SignUpFragment(), "SignUp")
        })
        return view
    }

    private fun declareControls(view: View) {
//        spinnerJoinUsProviderTypes = view.findViewById(R.id.spinnerJoinUsProviderTypes)
//        txtJoinUsProviderName = view.findViewById(R.id.txtJoinUsProviderName)
//        txtJoinUsPhoneNumber = view.findViewById(R.id.txtJoinUsPhoneNumber)
//        txtJoinUsEmail = view.findViewById(R.id.txtJoinUsEmail)
//        spinnerJoinUsCountries = view.findViewById(R.id.spinnerJoinUsCountries)
//        spinnerJoinUsCities = view.findViewById(R.id.spinnerJoinUsCities)
//        spinnerJoinUsAreas = view.findViewById(R.id.spinnerJoinUsAreas)
//        txtJoinUsAddress = view.findViewById(R.id.txtJoinUsAddress)
        btnSubmitRequest = view.findViewById(R.id.btnSubmitRequest)
    }

    private fun validate(): Boolean {
        /*txtJoinUsProviderName.error = null
        txtJoinUsPhoneNumber.error = null
        txtJoinUsEmail.error = null
        txtJoinUsAddress.error = null
        *//*var selectedType = spinnerJoinUsProviderTypes.selectedItem as ApiDefinitionDto
        var selectedCountry = spinnerJoinUsCountries.selectedItem as ApiDefinitionDto
        var selectedCity = spinnerJoinUsCities.selectedItem as ApiDefinitionDto
        var selectedArea = spinnerJoinUsAreas.selectedItem as ApiDefinitionDto*//*
        if (selectedType.Id == 0) {
            var selectedView = spinnerJoinUsProviderTypes.selectedView as LinearLayout
            var lblSpinnerName = selectedView.findViewById<TextView>(R.id.lblSpinnerName)
            lblSpinnerName.error = getString(R.string.Pages_JoinUs_RequiredType)
            lblSpinnerName.requestFocus()
            return false
        } else if (txtJoinUsProviderName.text.isEmpty()) {
            txtJoinUsProviderName.error = getString(R.string.Pages_JoinUs_RequiredProviderName)
            txtJoinUsProviderName.requestFocus()
            return false
        } else if (txtJoinUsPhoneNumber.text.isEmpty()) {
            txtJoinUsPhoneNumber.error = getString(R.string.Pages_JoinUs_RequiredPhoneNumber)
            txtJoinUsPhoneNumber.requestFocus()
            return false
        } else if (txtJoinUsEmail.text.isEmpty()) {
            txtJoinUsEmail.error = getString(R.string.Pages_JoinUs_RequiredEmail)
            txtJoinUsEmail.requestFocus()
            return false
        } else if (!Global.checkEmail(txtJoinUsEmail.text.toString())) {
            txtJoinUsEmail.error = getString(R.string.Pages_JoinUs_InvalidEmail)
            txtJoinUsEmail.requestFocus()
            return false
        } else if (txtJoinUsPhoneNumber.text.isEmpty()) {
            txtJoinUsPhoneNumber.error = getString(R.string.Pages_JoinUs_RequiredPhoneNumber)
            txtJoinUsPhoneNumber.requestFocus()
            return false
        } else if (selectedCountry.Id == 0) {
            var selectedView = spinnerJoinUsCountries.selectedView as LinearLayout
            var lblSpinnerName = selectedView.findViewById<TextView>(R.id.lblSpinnerName)
            lblSpinnerName.error = getString(R.string.Pages_JoinUs_RequiredCountry)
            lblSpinnerName.requestFocus()
            return false
        } else if (selectedCity.Id == 0) {
            var selectedView = spinnerJoinUsCities.selectedView as LinearLayout
            var lblSpinnerName = selectedView.findViewById<TextView>(R.id.lblSpinnerName)
            lblSpinnerName.error = getString(R.string.Pages_JoinUs_RequiredCity)
            lblSpinnerName.requestFocus()
            return false
        } else if (selectedArea.Id == 0) {
            var selectedView = spinnerJoinUsAreas.selectedView as LinearLayout
            var lblSpinnerName = selectedView.findViewById<TextView>(R.id.lblSpinnerName)
            lblSpinnerName.error = getString(R.string.Pages_JoinUs_RequiredArea)
            lblSpinnerName.requestFocus()
            return false
        } else if (txtJoinUsAddress.text.isEmpty()) {
            txtJoinUsAddress.error = getString(R.string.Pages_Login_RequiredAddress)
            txtJoinUsAddress.requestFocus()
            return false
        }*/
        return true
    }

    private fun loadDataService() {
        /*accountActivity.showLoadingBar()
        JoinUs_Listener(accountActivity, this).getJoinUsDataService(HashMap<String, Any>())*/
    }

    private fun loadCitiesService(countryId: Int) {
//        accountActivity.showLoadingBar()
//        var listener = JoinUs_Listener(accountActivity, this)
//        var hashMap = HashMap<String, Any>()
//        hashMap.put("CountryId", countryId)
//        listener.getCitiesService(hashMap)
    }

    private fun loadAreasService(cityId: Int) {
        /*accountActivity.showLoadingBar()
        var listener = JoinUs_Listener(accountActivity, this)
        var hashMap = HashMap<String, Any>()
        hashMap.put("CityId", cityId)
        listener.getAreasService(hashMap)*/
    }

    /*override fun onError(str: String) {
        accountActivity.hideLoadingBar()
        if (str != "")
            Global.makeLongToast(accountActivity, str, 5000)
    }

    override fun onGetListSuccess(result: GetJoinUsDataOutput) {
        accountActivity.hideLoadingBar()
        this.TypesList.addAll(result.Types!!)
        var adapterTypes = SpinnerAdapter(accountActivity, this.TypesList)
        spinnerJoinUsProviderTypes.adapter = adapterTypes

        this.CountriesList.addAll(result.Countries!!)
        var adapter = SpinnerAdapter(accountActivity, this.CountriesList)
        spinnerJoinUsCountries.adapter = adapter
        spinnerJoinUsCountries.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                CitiesList = ArrayList<ApiDefinitionDto>()
                CitiesList.add(ApiDefinitionDto(0, accountActivity.resources.getString(R.string.Pages_JoinUs_AllCities)))
                var adapterCity = SpinnerAdapter(accountActivity, CitiesList)
                spinnerJoinUsCities.adapter = adapterCity

                AreasList = ArrayList<ApiDefinitionDto>()
                AreasList.add(ApiDefinitionDto(0, accountActivity.resources.getString(R.string.Pages_JoinUs_AllAreas)))
                var adapterArea = SpinnerAdapter(accountActivity, AreasList)
                spinnerJoinUsAreas.adapter = adapterArea

                if (id > 0) {
                    loadCitiesService(id.toInt())
                }
            }

        }
    }

    override fun onGetCitiesSuccess(result: GetCitiesOutput) {
        accountActivity.hideLoadingBar()
        this.CitiesList.addAll(result.Cities!!)
        var adapter = SpinnerAdapter(accountActivity, this.CitiesList)
        spinnerJoinUsCities.adapter = adapter
        var adapterArea = SpinnerAdapter(accountActivity, this.AreasList)
        spinnerJoinUsAreas.adapter = adapterArea
        spinnerJoinUsCities.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                AreasList = ArrayList<ApiDefinitionDto>()
                AreasList.add(ApiDefinitionDto(0, accountActivity.resources.getString(R.string.Pages_JoinUs_AllAreas)))
                var adapterArea = SpinnerAdapter(accountActivity, AreasList)
                spinnerJoinUsAreas.adapter = adapterArea
                if (id > 0) {
                    loadAreasService(id.toInt())
                }
            }

        }
    }

    override fun onGetAreasSuccess(result: GetAreasOutput) {
        accountActivity.hideLoadingBar()
        this.AreasList.addAll(result.Areas!!)
        var adapter = SpinnerAdapter(accountActivity, this.AreasList)
        spinnerJoinUsAreas.adapter = adapter
    }
*/
    private fun submitRequestService() {
       /* accountActivity.showLoadingBar()
        var selectedType = spinnerJoinUsProviderTypes.selectedItem as ApiDefinitionDto
        var selectedArea = spinnerJoinUsAreas.selectedItem as ApiDefinitionDto
        var listener = JoinUs_Listener(accountActivity, this)
        var hashMap = HashMap<String, Any>()
        hashMap.put("ProvidersTypeId", selectedType.Id)
        hashMap.put("Name", txtJoinUsProviderName.text.toString())
        hashMap.put("MobileNumber", txtJoinUsPhoneNumber.text.toString())
        hashMap.put("EmailAddress", txtJoinUsEmail.text.toString())
        hashMap.put("Address", txtJoinUsAddress.text.toString())
        hashMap.put("AreaId", selectedArea.Id)
        listener.submitRequestService(hashMap)*/
    }

   /* override fun onSubmitSuccess(str: String) {
        accountActivity.hideLoadingBar()
        Global.makeLongToast(
            context,
            accountActivity.resources.getString(R.string.Pages_JoinUs_SendRequestSuccessfully),
            5000
        )
        accountActivity.replaceFragment(LoginFragment(), "Login");
    }*/

}