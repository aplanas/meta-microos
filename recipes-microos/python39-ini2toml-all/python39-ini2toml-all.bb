SUMMARY = "Python ini2toml[all] extra requirement"
DESCRIPTION = "The ini2toml[all] extra requirements for python39-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.11.3"

RPM_NAME = "python39-ini2toml-all-0.11.3-2.1.noarch.rpm"
RPM_HASH = "2dff3a1f13208462684ba8e790cbb0df90fdbd93e44869243236f7068b6c30054f1501aac78dd8efa3f17f4053db45a454893894d644b1c9912473903b48036f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-ini2toml-all"
RDEPENDS:${PN} += "(python39-configupdater >= 3.0.1 with python39-configupdater < 4) (python39-importlib-metadata if python39-base < 3.8) (python39-tomli-w >= 0.4.0 with python39-tomli-w < 2) (python39-tomlkit >= 0.10 with python39-tomlkit < 2) python39-ini2toml"

inherit rpm
