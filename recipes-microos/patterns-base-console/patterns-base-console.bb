SUMMARY = "Console Tools"
DESCRIPTION = "Applications useful for those using the console and no graphical desktop environment."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-console-20200505-40.1.aarch64.rpm"
RPM_HASH = "68843a6f3f80d6fbdf7c75bd7a94804d9c84b897060c7a8152c2b93f48378c58f69d41357262e1fed16c8d9714d22b270d5345b65ee3920613089ae9e8d2c868"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-console patterns-base-console(aarch-64) patterns-openSUSE-console"
RDEPENDS:${PN} += "pattern()"

inherit rpm
