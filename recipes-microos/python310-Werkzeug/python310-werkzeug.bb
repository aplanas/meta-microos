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

RPM_NAME = "python310-Werkzeug-2.2.3-2.1.noarch.rpm"
RPM_HASH = "b40366d091e70e34cada8e0e4badffff26e605013af4cc6de8456122c128897151882c9a0107153a00193ab80982a9d86a74b4e271103238267262b75fe28ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Werkzeug \
python3-Werkzeug-doc \
python3.10dist(werkzeug) \
python310-Werkzeug \
python310-Werkzeug-doc \
python3dist(werkzeug)"
RDEPENDS:${PN} += "python(abi) \
python310-MarkupSafe"

inherit rpm
