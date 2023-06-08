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

RPM_NAME = "python311-easywatch-0.0.5-2.17.noarch.rpm"
RPM_HASH = "32554b4cc55f20b0a2eaa766decef39d9f2e4372b6b6148a91af83da7604538c57efb6732b6d9743672156aaf4257e8ec79caa7e915bd67a09bc75444c2908bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(easywatch) python311-easywatch python3dist(easywatch)"
RDEPENDS:${PN} += "python(abi) python311-watchdog"

inherit rpm
