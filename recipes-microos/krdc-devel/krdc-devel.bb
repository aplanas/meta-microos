SUMMARY = "Development files for krdc"
DESCRIPTION = "Development libraries and headers needed to build software using krdc"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "krdc-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "3dbd8a18feee2b077799986ce81c4803d9490411815bee2491c26adb5fe59f9466762138a21623dff73962fa6bc9c17bd6eaca481c39be337a56614c63217944"

RPROVIDES:${PN} += "krdc-devel krdc-devel(aarch-64)"
RDEPENDS:${PN} += "krdc"

inherit rpm
