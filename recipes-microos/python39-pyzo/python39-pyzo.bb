SUMMARY = "Python IDE for scientific computing"
DESCRIPTION = "Pyzo is a computing environment based on Python. Pyzo is a Python IDE \
aimed at interactivity, and consists of an editor, a shell, and a set \
of tools."
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "python39-pyzo-4.11.2-1.12.noarch.rpm"
RPM_HASH = "2845f696b53f16c5007e7bd536b440f359fad1c014ba25d414d38151e24e826b8a7408e271112e97409d63a369f84044347be070a7467dae0a78e6bf4125c87d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyzo) \
python39-pyzo \
python3dist(pyzo)"
RDEPENDS:${PN} += "hicolor-icon-theme \
python(abi) \
python39-qt5 \
pyzologo"

inherit rpm
