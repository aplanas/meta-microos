SUMMARY = "Python dependency injection framework, inspired by Guice"
DESCRIPTION = "Dependency injection as a formal pattern is less useful in Python than \
in other languages, primarily due to its support for keyword \
arguments, the ease with which objects can be mocked, and its dynamic \
nature. \
 \
That said, a framework for assisting in this process can remove a lot \
of boiler-plate from larger applications. That's where Injector can \
help. It automatically and transitively provides keyword arguments \
with their values. As an added benefit, Injector encourages nicely \
compartmentalised code through the use of Module s. \
 \
While being inspired by Guice, it does not slavishly replicate its \
API. Providing a Pythonic API trumps faithfulness."
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "python310-injector-0.20.1-1.3.noarch.rpm"
RPM_HASH = "58d4719817f61f2cd0175fe534e5addf422ef0d7d8738c6e754c154a1d0b64d788f015aeb3ca5e6545eaff9cdee2b2e4754a25fbdf18387352bdcd177acb21c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-injector \
python3.10dist(injector) \
python310-injector \
python3dist(injector)"
RDEPENDS:${PN} += "python(abi) \
python310"

inherit rpm
