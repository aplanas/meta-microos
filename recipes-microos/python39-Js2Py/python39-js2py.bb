SUMMARY = "JavaScript to Python Translator & JavaScript interpreter"
DESCRIPTION = "Translates JavaScript to Python code. Js2Py is able to translate and \
execute virtually any JavaScript code. Js2Py, basically an \
implementation of the JavaScript core, is written in pure Python."
LICENSE = "MIT"

PV = "0.74"

RPM_NAME = "python39-Js2Py-0.74-2.1.noarch.rpm"
RPM_HASH = "afe06292681b5fabc2722402db13bf9e6c8bc06e5d51b635ebf2773e24bd364fd2827c45157a9bdba76273d85138c45c054c7b2e9015a6705d91b1ce7dada6c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(js2py) \
python39-Js2Py \
python3dist(js2py)"
RDEPENDS:${PN} += "python(abi) \
python39-pyjsparser \
python39-six \
python39-tzlocal"

inherit rpm
