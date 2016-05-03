package actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ihm.FrameErrorEnableAdvert.FrameErrorEnableAdvert;


public class ErrorEnableAdvertListener implements ActionListener
{
	FrameErrorEnableAdvert frameErrorEnableAdvert;
	
	public ErrorEnableAdvertListener(FrameErrorEnableAdvert frameErrorEnableAdvert)
	{
		this.frameErrorEnableAdvert = frameErrorEnableAdvert;		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == frameErrorEnableAdvert.getBtnOk())
		{
			frameErrorEnableAdvert.dispose();
		}
		
	}

}
