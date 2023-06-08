SUMMARY = "A logging module for Python"
DESCRIPTION = "* Logs to console and/or file. \
* Pretty formatting, including level-specific colors in the console. \
* Robust against str/bytes encoding problems, works with all kinds of character encodings and special characters. \
* Heavily inspired by the Tornado web framework."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-logzero-1.7.0-3.8.noarch.rpm"
RPM_HASH = "46644b213c390dcf4c865a3961335df4f0183232b3cf64387b798adf47e43917462c78d629c11f06d317500e52ca5301e930189b1c81bbea9b70cb6276974675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(logzero) python39-logzero python3dist(logzero)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
