SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "1.24.0"

RPM_NAME = "python311-sentry-sdk-1.24.0-1.1.noarch.rpm"
RPM_HASH = "10c325b48693ae6e41c6a20961696229204e88dcc33b50892fd1ae67fa578aed177e2020ef6a35da4724631577b9ec4c916764866da6c22c5c0f4061eb49566b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sentry-sdk) python311-sentry-sdk python3dist(sentry-sdk)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-Flask python311-SQLAlchemy python311-aiohttp python311-asttokens python311-blinker python311-bottle python311-celery python311-certifi python311-executing python311-falcon python311-httpx python311-jsonschema python311-pymongo python311-rq python311-starlette python311-tornado python311-urllib3"

inherit rpm
