SUMMARY = "Structured Logging for Python"
DESCRIPTION = "structlog makes logging in Python less painful and more powerful by adding \
structure to your log entries. \
 \
It’s up to you whether you want structlog to take care about the output of your \
log entries or whether you prefer to forward them to an existing logging system \
like the standard library’s logging module."
LICENSE = "Apache-2.0 | MIT"

PV = "22.1.0"

RPM_NAME = "python310-structlog-22.1.0-2.3.noarch.rpm"
RPM_HASH = "8d9cca952437012bae6ac63456df047f089c69ab1b5c5d655146d2afded32fbd64a7d20a2ee8e891eeff0811f89c0b6c3198395fc1ff1dee03b969997f40769d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-structlog \
python3.10dist(structlog) \
python310-structlog \
python3dist(structlog)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
