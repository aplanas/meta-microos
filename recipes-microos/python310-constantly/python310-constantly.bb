SUMMARY = "Symbolic constants in Python"
DESCRIPTION = "A library that provides symbolic constant support. \
It includes collections and constants with text, numeric, and bit flag values. \
Originally ``twisted.python.constants`` from the `Twisted <https://twistedmatrix.com/>`_ project."
LICENSE = "MIT"

PV = "15.1.0"

RPM_NAME = "python310-constantly-15.1.0-3.1.noarch.rpm"
RPM_HASH = "b1f78c6dbbb34b8169a3ea6062a81c873476761af04663dc25f4b66a0f103fafd8257ccdfe353effc58fb187081325adab14e320360f2d3c7edd94f88817358e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-constantly \
python3.10dist(constantly) \
python310-constantly \
python3dist(constantly)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
