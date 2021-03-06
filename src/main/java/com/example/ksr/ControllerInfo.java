package com.example.ksr;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;

import java.io.File;

public class ControllerInfo extends Window {



    @FXML
    private Label lable;

    @FXML
    private Label lable1;

    @FXML
    void initialize()  {



    }

    @FXML
    public void click1(){
        lable.setText("Приземный озон не выпускается напрямую, он образуется в атмосфере из-за других основных загрязнителей при отсутствии солнца.");
        lable1.setText("Воздействие озона связывают с проблемами дыхания, астмой, снижением функции легких и респираторными заболеваниями.");
    }

    @FXML
    public void click2(){
        lable.setText("Диоксид серы образуется при сжигании определенных видов ископаемого топлива и вследствие применения определенных методов извлечения металлов. SO2 также может способствовать возникновению кислотных дождей.");
        lable1.setText("Установлено, что воздействие SO2 наносит вред дыхательной системе и вызывает раздражение глаз. Согласно данным Всемирной организации здравоохранения, это может увеличить риск различных заражений.");
    }

    @FXML
    public void click3(){
        lable.setText("Твердые частицы – это широкое семейство вдыхаемых частиц, классифицируемых по размеру. Их источники могут быть естественными или искусственными, например, пыль, дым от огня, морская соль, сажа, они также могут возникать в результате промышленной деятельности.");
        lable1.setText("Частицы PM10 могут вдыхаться. Это значит, что они могут попасть в легкие и вызвать воспаление в дыхательной системе и сердце. Частицы PM2,5 проникают в организм еще глубже, попадают в кровоток и могут переноситься к различным органам, включая кожу (!)");
    }

    @FXML
    public void click4(){
        lable.setText("Основными источниками оксида углерода являются выделяемые автомобилями токсичные газы и промышленная деятельность с использованием ископаемого топлива (например, угля, нефти, природного газа).");
        lable1.setText("В больших количествах воздействие CO может повлиять на уровень кислорода, который переносится по кровотоку к важнейшим органам. Есть также свидетельства того, что его длительное воздействие на организм (даже в небольших количествах) приводит к еще более серьезным последствиям.");
    }

    @FXML
    public void click5(){
        lable.setText("NO2 отвечает за образование озона и твердых частиц, и так же, как и SO2, в основном выбрасывается промышленными и транспортными источниками.");
        lable1.setText("Сам по себе N02 усиливает симптомы бронхита, астмы, а также способствует снижению функции легких и их роста. В настоящее время ученые также связывают NO2 с преждевременной смертностью и сердечными/респираторными заболеваниями.");
    }
}
