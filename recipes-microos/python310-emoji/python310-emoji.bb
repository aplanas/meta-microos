SUMMARY = "Emoji for Python"
DESCRIPTION = "This Python module provides unicode emoji output for strings containing emoji codes. \
In addition to the official list defined by the unicode consortium a whole bunch of aliases is defined. \
 \
Example: \
>> import emoji \
>> print(emoji.emojize('Python is :thumbs_up:')) \
Python is 👍 \
>> print(emoji.emojize('Python is :thumbsup:', use_aliases=True)) \
Python is 👍 \
 \
By default, the language is English (``language='en'``) several further languages are also supported."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python310-emoji-2.4.0-1.1.noarch.rpm"
RPM_HASH = "0d7dec2e4f30f36ce0e527cdf33962f671b6b067042795b9509fb2b4d07875b56457ff7ff5d472ad336930436f403a3df3f2f41d28a31b49a1d7d612c6f50285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-emoji python3.10dist(emoji) python310-emoji python3dist(emoji)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
