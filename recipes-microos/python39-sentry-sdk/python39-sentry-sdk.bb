SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "1.24.0"

RPM_NAME = "python39-sentry-sdk-1.24.0-1.1.noarch.rpm"
RPM_HASH = "82efd7af3104685bef1ab00ad5d29e260ceb212a4a2a8fbe30c4ee3013ec5e52fba25b8e98149c61703c529deeefd5f127e1e193eb95c319f4af9606725f6c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sentry-sdk) python39-sentry-sdk python3dist(sentry-sdk)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-Flask python39-SQLAlchemy python39-aiohttp python39-asttokens python39-blinker python39-bottle python39-celery python39-certifi python39-executing python39-falcon python39-httpx python39-jsonschema python39-pymongo python39-rq python39-starlette python39-tornado python39-urllib3"

inherit rpm
