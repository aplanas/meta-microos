SUMMARY = "The Swiss Army knife of Python web development"
DESCRIPTION = "Werkzeug started as simple collection of various utilities for WSGI \
applications and has become one of the most advanced WSGI utility \
modules.  It includes a powerful debugger, full featured request and \
response objects, HTTP utilities to handle entity tags, cache control \
headers, HTTP dates, cookie handling, file uploads, a powerful URL \
routing system and a bunch of community contributed addon modules. \
 \
Werkzeug is unicode aware and doesn't enforce a specific template \
engine, database adapter or anything else.  It doesn't even enforce \
a specific way of handling requests and leaves all that up to the \
developer. It's most useful for end user applications which should work \
on as many server environments as possible (such as blogs, wikis, \
bulletin boards, etc.)."
LICENSE = "BSD-3-Clause"

PV = "2.2.3"

RPM_NAME = "python311-Werkzeug-2.2.3-2.1.noarch.rpm"
RPM_HASH = "8c1e53646f72b670fe8cd488b49a121f727374b5674ee17b48fb49826528ce6ef2f31c588a1926b4e0a95d8e54668d7ccf050b9daf62484370c0b6c7fb04995e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(werkzeug) python311-Werkzeug python311-Werkzeug-doc python3dist(werkzeug)"
RDEPENDS:${PN} += "python(abi) python311-MarkupSafe"

inherit rpm
