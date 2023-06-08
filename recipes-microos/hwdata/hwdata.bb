SUMMARY = "Hardware identification and configuration data"
DESCRIPTION = "hwdata contains various hardware identification and configuration data, \
such as the pci.ids and usb.ids databases."
LICENSE = "GPL-2.0-or-later"

PV = "0.369"

RPM_NAME = "hwdata-0.369-1.1.noarch.rpm"
RPM_HASH = "71d1a5cbebaff4b9fecb67291feed9b94eddd9b0225376bdee5c83d0dde162a1e6a48f32dae70115bb195acd47dfeb5cc5a83d4430ada3cf27dae1bf1680f917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwdata pciutils-ids pkgconfig(hwdata)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl /usr/bin/pkg-config coreutils perl"

inherit rpm
