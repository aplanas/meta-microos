SUMMARY = "Configure netconsole Kernel Module"
DESCRIPTION = "netconsole is a kernel feature to log the dmesg output via the network. \
The used network driver must support the polling function. \
 \
netconsole-server is a wrapper for insmod to load netconsole.o with the \
correct options. Use netcat on the client side to receive the kernel \
messages."
LICENSE = "SUSE-Public-Domain"

PV = "20030909"

RPM_NAME = "netconsole-tools-20030909-158.2.noarch.rpm"
RPM_HASH = "3f1e87f234c64d10776ef2f632de4eeb897ab6d41f0985a8a0d7ffc45a3487308f464bee0936483858c47451e66d85144b9674bf111d0f27956b61c88f744814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netconsole-tools"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
