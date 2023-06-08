SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "1.15.0"

RPM_NAME = "python39-sentry-sdk-1.15.0-1.4.noarch.rpm"
RPM_HASH = "45c1fc379919bee8ca830add116a06080c14cdc70318287a6ea2337cadea1857ec4222482b61ffaef1b2d0458b8736a5b594914382bfcc1ff797d610aa6d2cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sentry-sdk) python39-sentry-sdk python3dist(sentry-sdk)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-Flask python39-SQLAlchemy python39-aiohttp python39-asttokens python39-blinker python39-bottle python39-celery python39-certifi python39-executing python39-falcon python39-httpx python39-jsonschema python39-pymongo python39-rq python39-starlette python39-tornado python39-urllib3"

inherit rpm
