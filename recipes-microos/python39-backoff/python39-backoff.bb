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

RPM_NAME = "python39-backoff-2.2.1-1.3.noarch.rpm"
RPM_HASH = "10cd441998ffb83c47b53f231c42b3c09182ddc560db6d9d3875a57f8790450a75bf82c6db0790b9770a7784af290c7d73aaf75de7bee8bddc1a167048226df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(backoff) python39-backoff python3dist(backoff)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
