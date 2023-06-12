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

RPM_NAME = "python311-emoji-2.4.0-1.1.noarch.rpm"
RPM_HASH = "25b09aa511cc590ed8874c94697b0f32fb50314320c8b243cd9404262af5be667f1bc212c3be4b44fc10f5f5d6b9a187d931739564e84bd3121b3010b0600812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(emoji) python311-emoji python3dist(emoji)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
