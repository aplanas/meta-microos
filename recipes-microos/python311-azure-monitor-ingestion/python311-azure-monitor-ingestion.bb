SUMMARY = "Microsoft Azure Monitor Ingestion Client Library for Python"
DESCRIPTION = "The Azure Monitor Ingestion client library is used to send custom logs to Azure Monitor. \
 \
This library allows you to send data from virtually any source to supported built-in tables \
or to custom tables that you create in Log Analytics workspace. You can even extend the schema \
of built-in tables with custom columns."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-azure-monitor-ingestion-1.0.1-1.1.noarch.rpm"
RPM_HASH = "53cf1b8b76a62e5c7add3f87cf699751e74726bf3f360249bf6bcabbd24940907700437eea2796f0d508cc143bf7454dd6e888b993c6c597feeeeb876d4b85a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-monitor-ingestion) python311-azure-monitor-ingestion python3dist(azure-monitor-ingestion)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.0.1 if python311-base < 3.8) python(abi) python311-azure-core python311-azure-monitor-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
