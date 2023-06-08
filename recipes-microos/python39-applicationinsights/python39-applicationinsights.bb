SUMMARY = "Microsoft Application Insights for Python"
DESCRIPTION = "This project extends the Application Insights API surface to support Python. \
 \
Application Insights is a service that allows developers to keep their \
application available, performing and succeeding. This Python module will \
allow you to send telemetry of various kinds (event, trace, exception, etc.) \
to the Application Insights service where they can be visualized in the \
Azure Portal."
LICENSE = "MIT"

PV = "0.11.10"

RPM_NAME = "python39-applicationinsights-0.11.10-1.8.noarch.rpm"
RPM_HASH = "13c915dd03de6040e45dec2ff923366bd17df36cc6a7fcc239732440568cec12fb6827690319650a5efdcd488b853fc1d197bb491f6195f449214a5195d141fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(applicationinsights) python39-applicationinsights python3dist(applicationinsights)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
