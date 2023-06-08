SUMMARY = "Korean documentation for lxc"
DESCRIPTION = "Korean language man pages for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.1"

RPM_NAME = "lxc-ko-doc-5.0.1-2.3.noarch.rpm"
RPM_HASH = "05708337c2648395da5b612a09bda3ee35e3a1aaaab0d2b1f09bfa3d7fb139c3bfea1b0f51152f8e216c230856901f1fd32cf04523f82077384ff33f571ca3ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-ko-doc"
RDEPENDS:${PN} += "lxc"

inherit rpm
