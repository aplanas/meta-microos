SUMMARY = "OpenStack Profiler Library"
DESCRIPTION = "OSProfiler provides a tiny but powerful library that is used by \
most (soon to be all) OpenStack projects and their python clients. It \
provides functionality to be able to generate 1 trace per request, that goes \
through all involved services. This trace can then be extracted and used \
to build a tree of calls which can be quite handy for a variety of \
reasons (for example in isolating cross-project performance issues). \
 \
This package contains the Python 3.x module"
LICENSE = "Apache-2.0"

PV = "3.4.3"

RPM_NAME = "python3-osprofiler-3.4.3-1.5.noarch.rpm"
RPM_HASH = "5ce41d194436f81a071838ac50fa930f819fe5c1273f13a175ad1c2a742af95bb309805f012912510fdf602f6620ffa5703e4eac6745eddbc7379101e7569b9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-osprofiler \
python3.10dist(osprofiler) \
python3dist(osprofiler)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-PrettyTable \
python3-WebOb \
python3-importlib-metadata \
python3-oslo.concurrency \
python3-oslo.config \
python3-oslo.log \
python3-oslo.utils"

inherit rpm
