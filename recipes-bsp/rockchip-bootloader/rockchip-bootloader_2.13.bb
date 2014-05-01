# Copyright (C) 2014 NEO-Technologies
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Rockchip bootloader collection"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/neo-technologies/rockchip-bootloader.git"
SRCREV_pn-${PN} = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit deploy

do_install() {
    install -d ${DEPLOY_DIR_IMAGE}
    install ${S}/${ROCKCHIP_BOOTLOADER_IMAGE}.bin ${DEPLOY_DIR_IMAGE}/bootloader.bin
}
