SUMMARY = "The web fuzzer"
DESCRIPTION = " \
Wfuzz has been created to facilitate the task in web applications assessments \
and it is based on a simple concept: it replaces any reference to the FUZZ \
keyword by the value of a given payload. \
 \
A payload in Wfuzz is a source of data. \
 \
This simple concept allows any input to be injected in any field of an HTTP \
request, allowing to perform complex web security attacks in different web \
application components such as: parameters, authentication, forms, \
directories/files, headers, etc. \
 \
Wfuzz is more than a web content scanner: \
 \
* Wfuzz could help you to secure your web applications by finding and \
  exploiting web application vulnerabilities. Wfuzz’s web application \
  vulnerability scanner is supported by plugins. \
 \
* Wfuzz is a completely modular framework and makes it easy for even the newest \
  of Python developers to contribute. Building plugins is simple and takes \
  little more than a few minutes. \
 \
* Wfuzz exposes a simple language interface to the previous HTTP \
  requests/responses performed using Wfuzz or other tools, such as Burp. This \
  allows you to perform manual and semi-automatic tests with full context and \
  understanding of your actions, without relying on a web application scanner \
  underlying implementation. \
 \
 \
It was created to facilitate the task in web applications assessments, it's a \
tool by pentesters for pentesters ;)"
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "python39-wfuzz-3.1.0-3.3.noarch.rpm"
RPM_HASH = "10279e8b98cb88d58acbf9a84e577ec7ce9c0b03586a9d7ccbd5e15a286ef76049f7b1f2b2523ee8667162143673c6bd3b9b6637148b9a2e915d3b111df8d1ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wfuzz) python39-wfuzz python3dist(wfuzz)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
