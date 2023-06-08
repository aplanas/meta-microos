SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "1.15.0"

RPM_NAME = "python311-sentry-sdk-1.15.0-1.4.noarch.rpm"
RPM_HASH = "3e12cb84cd3b0e66b33f565b9758492f5c38d926539e4589f057afced2c25c3f97f02fdf3a03bce94ebd3941ca554315a659c5bc4308a32b3e71791604550e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sentry-sdk) python311-sentry-sdk python3dist(sentry-sdk)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-Flask python311-SQLAlchemy python311-aiohttp python311-asttokens python311-blinker python311-bottle python311-celery python311-certifi python311-executing python311-falcon python311-httpx python311-jsonschema python311-pymongo python311-rq python311-starlette python311-tornado python311-urllib3"

inherit rpm
