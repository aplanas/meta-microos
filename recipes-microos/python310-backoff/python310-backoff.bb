SUMMARY = "Function decoration for backoff and retry"
DESCRIPTION = "This module provides function decorators which can be used to wrap a \
function such that it will be retried until some condition is met. It \
is meant to be of use when accessing unreliable resources with the \
potential for intermittent failures i.e. network resources and external \
APIs. Somewhat more generally, it may also be of use for dynamically \
polling resources for externally generated content. \
 \
Decorators support both regular functions for synchronous code and \
`asyncio <https://docs.python.org/3/library/asyncio.html>`_'s coroutines \
for asynchronous code."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python310-backoff-2.2.1-1.3.noarch.rpm"
RPM_HASH = "e292fea0946789c198e5650f471d7903fe50f2f3d123eaad31966cb959bd104939d9e17121fea5bb6b959f5cc82c24274814aee1405fb9848c0d696ca62b4940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-backoff python3.10dist(backoff) python310-backoff python3dist(backoff)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
