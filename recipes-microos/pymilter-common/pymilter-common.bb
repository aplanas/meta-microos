SUMMARY = "Common files for pymilter"
DESCRIPTION = "This package contains the common files used for pymilter."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "pymilter-common-1.0.4-3.12.noarch.rpm"
RPM_HASH = "e378287194aa377b9c266e5180a994ce63100dc6b63d2461383e80a7ff1d87dd1b0c6efb7554f2515d2454cad034eec9bb888dad26fd2c79d482699f89b1f820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pymilter-common"
RDEPENDS:${PN} += "/bin/sh systemd"

inherit rpm
