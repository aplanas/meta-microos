SUMMARY = "Attract all documentations of installed TeXLive packages"
DESCRIPTION = "This package will attract all the documentation packages of any \
already installed TeXLive package."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2023.201"

RPM_NAME = "texlive-alldocumentation-2023.201-56.1.noarch.rpm"
RPM_HASH = "32a57bc41d0ae17f3e7f1c1425d670eb5a47a3fa3b6fff6bbfad1e1f8ff51a1f968fc2cc87c59e0a8bc8d1bd40b9eff3bc40a45df709d2b11d63d650f96513c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alldocumentation"
RDEPENDS:${PN} += ""

inherit rpm
