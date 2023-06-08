SUMMARY = "Access and modify the Windows Registry of a Windows VM"
DESCRIPTION = "Virt-win-reg lets you look at and modify the Windows Registry of \
Windows virtual machines."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "virt-win-reg-1.50.1-1.1.noarch.rpm"
RPM_HASH = "d4ddcf5e68179e0b0aa962e5ba9df5f9bed02d7421df68017e2968c92bef1f029b28bceb1d54e89e93aa57f2fe7d97f89de41fa3115dc3c0aef575833227e1d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-win-reg"
RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
