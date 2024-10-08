package nascimento.camila.galeriapublica;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
//MainViewModel herda de AndroidViewModel
public class MainViewModel extends AndroidViewModel {
    //MainViewModel guarda navigationOpSelected
    int navigationOpSelected = R.id.gridViewOp;
    //AndroidViewModel possui como parametro de entrada em seu construtor uma instancia da aplicacao
    public MainViewModel(@NonNull Application application) {
        super(application);
    }
    //metodos para pegar e setar o ultimo tipo de lista
    //que foi selecionado pelo usuario
    public int getNavigationOpSelected() {
        return navigationOpSelected;
    }
    public void setNavigationOpSelected(int navigationOpSelected) {
        this.navigationOpSelected = navigationOpSelected;
    }
}
