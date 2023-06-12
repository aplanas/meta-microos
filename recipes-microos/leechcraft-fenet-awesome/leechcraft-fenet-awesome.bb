SUMMARY = "Awesome Window Manager integration for LeechCraft"
DESCRIPTION = "This package allows to start Leechcraft as a Desktop Environment with \
the Awesome Window Manager."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-fenet-awesome-0.6.70+git.14794.g33744ae6ce-3.1.noarch.rpm"
RPM_HASH = "fe9de7898ff317c7af7edb1c6b3eaf31d3858fdbd7089c22548a909820aec7721d7b361c9226718ee188845f925041833ea74843a557bfcb8fe1a4c239af246e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-fenet-awesome \
leechcraft-fenet-wm"
RDEPENDS:${PN} += "/bin/sh \
awesome \
leechcraft-fenet"

inherit rpm
