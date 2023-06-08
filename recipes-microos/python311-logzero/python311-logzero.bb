SUMMARY = "A logging module for Python"
DESCRIPTION = "* Logs to console and/or file. \
* Pretty formatting, including level-specific colors in the console. \
* Robust against str/bytes encoding problems, works with all kinds of character encodings and special characters. \
* Heavily inspired by the Tornado web framework."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-logzero-1.7.0-3.8.noarch.rpm"
RPM_HASH = "365a8fde4785ff56f3c7d773bbdb4b180d783ad95406d6668c7a5da0d16fbabe90b88ecbb32ff039eb7b25c72a05dbad2359dfb5b59858fda6a1d4d670c20d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(logzero) python311-logzero python3dist(logzero)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
