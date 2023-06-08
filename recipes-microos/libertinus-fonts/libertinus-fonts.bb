SUMMARY = "Libertinus font family"
DESCRIPTION = "Libertinus font family: serif, sans and mono. It is a fork of the Linux Libertine font family."
LICENSE = "OFL-1.1"

PV = "7.040"

RPM_NAME = "libertinus-fonts-7.040-1.7.noarch.rpm"
RPM_HASH = "7f0eb3f0c3a7e9ddd5b9f0faf86d1e68eedde6ef855f606b5377ae21f0f1bf4ac8669919568a86ba3a66fef357f23a1fcb51f179f6b79e28a9cfe5bc9ca61d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libertinus-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
