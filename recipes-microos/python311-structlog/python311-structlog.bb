SUMMARY = "Structured Logging for Python"
DESCRIPTION = "structlog makes logging in Python less painful and more powerful by adding \
structure to your log entries. \
 \
It’s up to you whether you want structlog to take care about the output of your \
log entries or whether you prefer to forward them to an existing logging system \
like the standard library’s logging module."
LICENSE = "Apache-2.0 | MIT"

PV = "22.1.0"

RPM_NAME = "python311-structlog-22.1.0-2.3.noarch.rpm"
RPM_HASH = "e523aef089def9f4e10fabf892898d0312fa012ea6e43c0a35e6aa969f2e36f9abc0b4c24a53e6cf8a4f28079c7a5388519a44032dcdad833e658fd111e5c877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(structlog) \
python311-structlog \
python3dist(structlog)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
