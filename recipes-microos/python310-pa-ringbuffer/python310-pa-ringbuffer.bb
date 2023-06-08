SUMMARY = "Python wrapper for PortAudio's ring buffer"
DESCRIPTION = "The ring buffer functionality is typically not included in binary \
distributions of PortAudio, therefore most Python wrappers don't include it, \
either. \
 \
The pa_ringbuffer module provides only a Python wrapper, the actual \
PortAudio ring buffer code has to be compiled separately. \
It can be used on any Python version where CFFI is available. \
 \
This module is designed to be used together with the sounddevice module (it \
might work with other modules, too) for non-blocking transfer of data between \
the main Python program and an audio callback function which is implemented in C \
or some other compiled language. \
 \
This module is not meant to be used on its own, it is only useful in cooperation \
with another Python module using CFFI."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python310-pa-ringbuffer-0.1.4-1.3.noarch.rpm"
RPM_HASH = "d9b24789b17bad92fc8a282aa1cc4e3e10f119d81e515a88c06397b417a780acc05b448d31cc877a24fae8b40b35513f8bdaaa78cf6ba01f685965890bc3b509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pa-ringbuffer python3.10dist(pa-ringbuffer) python310-pa-ringbuffer python3dist(pa-ringbuffer)"
RDEPENDS:${PN} += "python(abi) python310-cffi"

inherit rpm
