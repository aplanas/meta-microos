SUMMARY = "Directory monitoring package for Python"
DESCRIPTION = "Easywatch exports one function, `watch` which watches a directory for \
changes and notifies a handler the type of event and the name of the \
file that triggered it. \
 \
There are four types of events that the handler can be notified about: \
 \
  * created: a file was created \
  * deleted: a file was deleted \
  * modified: a file was modified \
  * moved: a file was moved"
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python310-easywatch-0.0.5-2.17.noarch.rpm"
RPM_HASH = "5ca5a36044e5fa0d8ff6c36d98e587c9ce7982766acb8dffafbde37e9d75204742f0eeb3a424e2d2c2a30c5e41377ff0d8e9b2e9411d42e1022f3c33c242c842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easywatch python3.10dist(easywatch) python310-easywatch python3dist(easywatch)"
RDEPENDS:${PN} += "python(abi) python310-watchdog"

inherit rpm
