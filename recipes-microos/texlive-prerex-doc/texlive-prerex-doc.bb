SUMMARY = "Documentation for texlive-prerex"
DESCRIPTION = "This package includes the documentation for texlive-prerex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-prerex-doc-2023.201.svn54512-52.1.noarch.rpm"
RPM_HASH = "d4fc8c3d34fb9288c93bcc3be64a4f5796c47e809e7d493b36e74d7600336db4b6e57060ac08aebbad7573c569898d091d7cd93e99f01a023db12245f0a685f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(prerex.5) texlive-prerex-doc"
RDEPENDS:${PN} += ""

inherit rpm
