package com.example.marceljulian.pilihpilihid;

public class Smartphone {

    private String baterai;
    private String cpu;
    private String gambarHpUrl;
    private String id;
    private String kamera;
    private String size;
    private String merk;
    private String os;
    private String ram;
    private String type;
    private String chipset;
    private String internal;
    private String kameradpn;
    private String gpu;
    private String kategori1;
    private String kategori2;
    private String kategori3;
    private String network;
    private String sim;
    private String resolution;
    private String cardSlot;
    private String fiturKamera;
    private String video;
    private String wlan;
    private String sensor;

    public Smartphone(){

    }

    public Smartphone(String baterai, String cpu, String gambarHpUrl, String id, String kamera, String size, String merk, String os, String ram, String type,String chipset, String internal, String kameradpn, String gpu,String kategori1, String kategori2, String kategori3,String network, String sim, String resolution, String cardSlot, String fiturKamera, String video, String wlan, String sensor) {
        this.baterai = baterai;
        this.cpu = cpu;
        this.setGambarHpUrl(gambarHpUrl);
        this.id = id;
        this.kamera = kamera;
        this.size = size;
        this.merk = merk;
        this.os = os;
        this.ram = ram;
        this.type = type;
        this.chipset = chipset;
        this.internal = internal;
        this.kameradpn = kameradpn;
        this.gpu = gpu;
        this.kategori1 = kategori1;
        this.kategori2 =kategori2;
        this.kategori3 = kategori3;
        this.network = network;
        this.sim = sim;
        this.resolution = resolution;
        this.cardSlot = cardSlot;
        this.fiturKamera = fiturKamera;
        this.video = video;
        this.wlan = wlan;
        this.sensor = sensor;
    }

    public String getBaterai() {
        return baterai;
    }

    public void setBaterai(String baterai) {
        this.baterai = baterai;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKamera() {
        return kamera;
    }

    public void setKamera(String kamera) {
        this.kamera = kamera;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGambarHpUrl() {
        return gambarHpUrl;
    }

    public void setGambarHpUrl(String gambarHpUrl) {
        this.gambarHpUrl = gambarHpUrl;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public String getKameradpn() {
        return kameradpn;
    }

    public void setKameradpn(String kameradpn) {
        this.kameradpn = kameradpn;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getKategori1() {
        return kategori1;
    }

    public void setKategori1(String kategori1) {
        this.kategori1 = kategori1;
    }

    public String getKategori2() {
        return kategori2;
    }

    public void setKategori2(String kategori2) {
        this.kategori2 = kategori2;
    }

    public String getKategori3() {
        return kategori3;
    }

    public void setKategori3(String kategori3) {
        this.kategori3 = kategori3;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getCardSlot() {
        return cardSlot;
    }

    public void setCardSlot(String cardSlot) {
        this.cardSlot = cardSlot;
    }

    public String getFiturKamera() {
        return fiturKamera;
    }

    public void setFiturKamera(String fiturKamera) {
        this.fiturKamera = fiturKamera;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getWlan() {
        return wlan;
    }

    public void setWlan(String wlan) {
        this.wlan = wlan;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }
}

