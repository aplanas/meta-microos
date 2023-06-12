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

RPM_NAME = "python311-injector-0.20.1-1.3.noarch.rpm"
RPM_HASH = "ea7db543e7579d95b81f539571e2cd8883f077f404007f8311a2af8b91416df9b2d1feaba659789de5c2e1b7004453987fe1969ba71295757da7532e3145b21e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(injector) \
python311-injector \
python3dist(injector)"
RDEPENDS:${PN} += "python(abi) \
python311"

inherit rpm
