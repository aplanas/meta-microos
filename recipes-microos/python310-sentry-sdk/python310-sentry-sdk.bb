SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "1.15.0"

RPM_NAME = "python310-sentry-sdk-1.15.0-1.4.noarch.rpm"
RPM_HASH = "7890da85c7b943a44d492ca1a48ddbf86aafe2400c05126d5cd533032fc92afdc62f4e9fb7d95f1ecd86946ea2bb2a23d118b3b3cadbd4aecb3c56b4c7079fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sentry-sdk python3.10dist(sentry-sdk) python310-sentry-sdk python3dist(sentry-sdk)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-Flask python310-SQLAlchemy python310-aiohttp python310-asttokens python310-blinker python310-bottle python310-celery python310-certifi python310-executing python310-falcon python310-httpx python310-jsonschema python310-pymongo python310-rq python310-starlette python310-tornado python310-urllib3"

inherit rpm
