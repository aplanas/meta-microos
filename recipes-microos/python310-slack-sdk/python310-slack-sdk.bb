SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.19.5"

RPM_NAME = "python310-slack-sdk-3.19.5-1.3.noarch.rpm"
RPM_HASH = "73a865f64375ac6e0938385861b6a86797d903bbae3f0b49955780c016465f7461d1f32ed30f5d31259186b07c3a000477c3f3c7d995689690223d82baa7b20b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-slack-sdk python3-slackclient python3.10dist(slack-sdk) python310-slack-sdk python310-slackclient python3dist(slack-sdk)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
