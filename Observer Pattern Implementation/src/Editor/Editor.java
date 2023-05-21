package Editor;

import Publisher.EventManager;

import java.io.File;

public class Editor {
    public EventManager event;
    private File file;

    public Editor(){
        this.event = new EventManager("open","save");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        event.notify("open",file);
    }

    public void saveFile() throws Exception{
        if(this.file != null){
            event.notify("save",file);
        }else{
            throw new Exception("Please Open a File First");
        }
    }


}
