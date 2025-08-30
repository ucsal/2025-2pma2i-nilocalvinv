package br.com.mariojp.solid.isp;

public class OfficeService {
    private final Printer device;

    public OfficeService(Printer device) {
        this.device = device;
    }

    public void printReport(String content) {
        device.print(content);
        // ❌ REMOVER scan – não é responsabilidade do OfficeService
        // Corrigido: não há mais chamada a scan()
    }
}
