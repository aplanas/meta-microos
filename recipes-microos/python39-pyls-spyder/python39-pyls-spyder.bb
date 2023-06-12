SUMMARY = "Spyder extensions for the python-language-server"
DESCRIPTION = "Spyder extensions for the python-lsp-server"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-pyls-spyder-0.4.0-1.7.noarch.rpm"
RPM_HASH = "813ce6cbd6ee2c20f1cde3db8bcb1c236cb0fd40202ab2c24b7a82ae6e7ab774f66cfbbc55e726c22532e007f30cd7803d3693561c8635d6d787d3821f82082e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyls-spyder) \
python39-pyls-spyder \
python3dist(pyls-spyder)"
RDEPENDS:${PN} += "python(abi) \
python39-python-lsp-server"

inherit rpm
