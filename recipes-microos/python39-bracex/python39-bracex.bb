SUMMARY = "Bash style brace expander"
DESCRIPTION = "Bash style brace expander."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python39-bracex-2.2.1-3.1.noarch.rpm"
RPM_HASH = "54df77f5b8e0532227cacb297ba82c1d2a02e2674b58d7e29954b86f138fceb548cdf8fdbb636ae12b48932c6e6eeb3c243d5edf7320af362c658a780cadf32e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bracex) python39-bracex python3dist(bracex)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
