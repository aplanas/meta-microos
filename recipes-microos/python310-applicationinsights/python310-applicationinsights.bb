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

RPM_NAME = "python310-applicationinsights-0.11.10-1.8.noarch.rpm"
RPM_HASH = "1e93546590fe428829bc0faf2710c9cc5e5f37606c95c3d20d6497ec600619538cccc58f0a191a7c94bcff5b53dd0586c0aa99fd884567e1ee22ff216c60b466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-applicationinsights \
python3.10dist(applicationinsights) \
python310-applicationinsights \
python3dist(applicationinsights)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
