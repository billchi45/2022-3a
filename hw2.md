# hw2

(1)
```graphviz
digraph {
	node[shape=record];
	rankdir="LR";
    no1 [label = "研擬計劃 | 任務:1 | 開始:第1天 | 結束:第1天 | 需時:1天"]
    no2 [label = "任務分配 | 任務:2 | 開始:第2天 | 結束:第5天 | 需時:4天"]
    no1->no2
    no3 [label = "取得硬體 | 任務:3 | 開始:第2天 | 結束:第18天 | 需時:17天"]
    no1->no3    
    no4 [label = "程式開發 | 任務:4 | 開始:第6天 | 結束:第75天 | 需時:70天"]
    no2->no4    
    no5 [label = "安裝硬體 | 任務:5 | 開始:第19天 | 結束:第28天 | 需時:10天"]
    no3->no5
    no6 [label = "程式測試 | 任務:6 | 開始:第76天 | 結束:第105天 | 需時:30天"]
    no4->no6
    no7 [label = "撰寫使用手冊 | 任務:7 | 開始:第29天 | 結束:第53天 | 需時:25天"]
    no5->no7
    no8 [label = "轉換檔案 | 任務:8 | 開始:第29天 | 結束:第48天 | 需時:20天"]
    no5->no8
    no9 [label = "系統測試 | 任務:9 | 開始:第106天 | 結束:第130天 | 需時:25天"]
    no6->no9
    no10 [label = "使用者訓練 | 任務:10 | 開始:第54天 | 結束:第73天 | 需時:20天"]
    no7->no10
    no8->no10
    no11 [label = "使用者測試 | 任務:11 | 開始:第131天 | 結束:第155天 | 需時:25天"]
    no9->no11
    no10->no11
}
```

(2)
```mermaid
gantt
    section 研擬計劃
    研擬計劃: 1, 2022-10-07, 1d
    section 任務分配
    任務分配: 2, after 1, 4d
    section 取得硬體
    取得硬體: 3, after 1, 17d
    section 程式開發
    程式開發: 4, after 2, 70d
    section 安裝硬體
    安裝硬體: 5, after 3, 10d
    section 程式測試
    程式測試: 6, after 4, 30d
    section 撰寫使用手冊
    撰寫使用手冊: 7, after 5, 25d
    section 轉換檔案
    轉換檔案: 8, after 5, 20d
    section 系統測試
    系統測試: 9, after 6, 25d
    section 使用者訓練
    使用者訓練: 10, after 7, 20d
    section 使用者測試
    使用者測試: 11, after 9, 25d
```

(3)
關鍵路徑： 1 → 2 → 4 → 6 → 9 → 11