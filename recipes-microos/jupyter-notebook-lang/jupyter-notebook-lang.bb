SUMMARY = "Translations for the Jupyter Notebook"
DESCRIPTION = "Provides translations for the Jupyter notebook. \
 \
This package provides the jupyter component translations."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "jupyter-notebook-lang-6.5.4-1.1.noarch.rpm"
RPM_HASH = "6ec76a5b55daeafddac71240482818534e0000e138034f8fa86eeade8363a07731b64d67c2910f0b3df26e12a992c97da3c17211ec9dc8fb7594dda9420e6678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook-lang jupyter-notebook-lang-all"
RDEPENDS:${PN} += "jupyter-notebook python3-notebook-lang"

inherit rpm
