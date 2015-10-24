package ru.linachan.bifrost;

import ru.linachan.yggdrasil.component.YggdrasilPlugin;

import java.io.IOException;

public class BifrostPlugin extends YggdrasilPlugin {
    @Override
    protected void setUpDependencies() {

    }

    @Override
    protected void onInit() {

    }

    @Override
    protected void onShutdown() {

    }

    @Override
    public boolean executeTests() {
        return true;
    }

    public BifrostSSHConnection connect(String host, int port, BifrostSSHAuth auth) throws IOException {
        return new BifrostSSHConnection(core, host, port, auth);
    }

    public BifrostSSHConnection connect(String host, int port, String proxy, BifrostSSHAuth auth) throws IOException {
        return new BifrostSSHConnection(core, host, port, proxy, auth);
    }
}
