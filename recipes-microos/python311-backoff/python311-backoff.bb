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

RPM_NAME = "python311-backoff-2.2.1-1.3.noarch.rpm"
RPM_HASH = "c59d7628466210c587dfd2148858663f32935506f03bc3624baf1d8d57f7776b81a49aa21eada87f5a7992da663fd49898403ab4d41c6320d6355156fa257bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(backoff) python311-backoff python3dist(backoff)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
